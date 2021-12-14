package com.asia.ProductShipment.main.controller;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.asia.ProductShipment.main.Main;
import com.asia.ProductShipment.main.service.MainService;
import com.asia.ProductShipment.users.Users;
import com.asia.ProductShipment.users.service.UsersService;

@RestController
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@Autowired
	private UsersService userService;

	@RequestMapping("/main.do")
	public ModelAndView dashboard(Main m) throws Exception {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails userDetails = (UserDetails)principal;
		
		
		ModelAndView modelAndView = new ModelAndView();		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String today = dateFormat.format(date);
		
		modelAndView.addObject("fr_date", m.getFr_date());
		modelAndView.addObject("to_date", m.getTo_date());
		
		if(m.getFr_date() == null) {
			//m.setFr_date(today.substring(0,4)+"-"+today.substring(4,2)+"-"+today.substring(6,2));
			m.setFr_date(today);
			modelAndView.addObject("fr_date", today.substring(0,4)+"-"+today.substring(4,6)+"-"+today.substring(6,8));
		}
		
		if(m.getTo_date() == null) {
			//m.setTo_date(today.substring(0,4)+"-"+today.substring(4,2)+"-"+today.substring(6,2));
			m.setTo_date(today);
			modelAndView.addObject("to_date", today.substring(0,4)+"-"+today.substring(4,6)+"-"+today.substring(6,8));
		}
		
		Users u = new Users();
		u.setID(userDetails.getUsername());
		m.setCUST_CODE(userService.selectUserCustcode(u));
		m.setAuthorities(userDetails.getAuthorities().toString());
		
		List<Main> list =  mainService.selectListMain(m);
		modelAndView.addObject("data", list);
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
	@PostMapping("/viewDetail.do")
	public ResponseEntity<?> viewDetailTable(@Validated @RequestBody Main m, Errors errors) {
		final Logger logger = LoggerFactory.getLogger(this.getClass());
		
		logger.info("detailViewData : " + m.getDetailViewData());
		
		String s[] = m.getDetailViewData().split("/");
		m.setSHIP_REG_DD(s[0]);
		m.setLOGI_CODE(s[1]);
		m.setSHIP_SEQ(s[2]);
		
		List<Main> list = mainService.selectListDetail(m);
		
		//m.setCAR_CODE("9999");
		return ResponseEntity.ok(list);
	}
	
	
	@RequestMapping(value = "/excelDown.do")
	public void excelDown(HttpServletRequest request, HttpServletResponse response,
	        @RequestParam(value = "title") String title, @RequestParam(value = "contents") String contents,
	        @RequestParam(value = "name") String name, @RequestParam(value = "rows") String rows,
	        @RequestParam(value = "columns") String columns) throws Exception {
		final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	    try {
	    	System.out.println("contents : " + contents);
			JSONArray dataArry = (JSONArray)JSONValue.parse(contents);		
	    	
	        //dataArry.add(contents);
	        String[] myTitle = title.split(",");
	 
	        // 로우 파라미터 int로 변환
	        int myRows = Integer.parseInt(rows);
	 
	        // 컬럼 파라미터 int로 변환
	        int myColumns = Integer.parseInt(columns);
	 
	        // Workbook 생성
	        Workbook xlsWb = new HSSFWorkbook(); // Excel 2007 이전 버전
	 
	        // Sheet 생성
	        Sheet sheet1 = xlsWb.createSheet(name);
	        Row row = null;
	        Cell cell = null;
	 
	        row = sheet1.createRow(0);
	        
	        //병합된 열이 있나 검사해서 있으면 그만큼 열 개수를 늘려준다.
        	int maxPlus = 0;
        	for (int i = 0; i < myTitle.length; i++) {
        		String titleInfo[] = myTitle[i].split("/");
        		if(!titleInfo[1].equals("undefined")) {
        			maxPlus = maxPlus + Integer.parseInt(titleInfo[1]);
        		}
			}
	        System.out.println("maxPlus : " + maxPlus);
	        // excel 파일 저장
	        for (int r = 0; r < myRows; r++) {
	        	
	            // 셀 제목 설정
	            if (r == 0) {
	            	int spanPlus = 0;
	                for (int c = 0; c < myTitle.length; c++) {
	                	cell = row.createCell(c + spanPlus);
	                    String titleInfo[] = myTitle[c].split("/");
	                    cell.setCellValue(titleInfo[0]);
	                    if(!titleInfo[1].equals("undefined")) {
	                    	for (int i = 1; i <= Integer.parseInt(titleInfo[1]); i++) {
	                    		cell = row.createCell(c+spanPlus+i);
							}
	                    	sheet1.addMergedRegion(new CellRangeAddress(0, 0, c, c+Integer.parseInt(titleInfo[1])-1));
	                    	spanPlus = spanPlus + Integer.parseInt(titleInfo[1])-1;
	                    }
	                }
	            }
	 
	            row = sheet1.createRow(r + 1); // 두번째줄을 생성(i+1)
	 
	            for (int c = 0; c < myTitle.length; c++) {
	            	//System.out.println("c : " + (String)((JSONObject)dataArry.get(r)).get(myTitle[c]));
	                cell = row.createCell(c);
	                cell.setCellValue((String)((JSONObject)dataArry.get(r)).get(myTitle[c].split("/")[0]));
	            }
	 
	        }
	 
	        // 브라우저 별 한글 인코딩
	        String header = request.getHeader("User-Agent");
	        if (header.contains("MSIE") || header.contains("Trident")) { // IE 11버전부터 Trident로 변경되었기때문에 추가해준다.
	            name = URLEncoder.encode(name, "UTF-8").replaceAll("\\+", "%20");
	            response.setHeader("Content-Disposition", "attachment;filename=" + name + ".xls;");
	        } else if (header.contains("Chrome")) {
	            name = new String(name.getBytes("UTF-8"), "ISO-8859-1");
	            response.setHeader("Content-Disposition", "attachment; filename=\"" + name + "\".xls");
	        } else if (header.contains("Opera")) {
	            name = new String(name.getBytes("UTF-8"), "ISO-8859-1");
	            response.setHeader("Content-Disposition", "attachment; filename=\"" + name + "\".xls");
	        } else if (header.contains("Firefox")) {
	            name = new String(name.getBytes("UTF-8"), "ISO-8859-1");
	            response.setHeader("Content-Disposition", "attachment; filename=\"" + name + "\".xls");
	        }
	 
	        // 엑셀 출력
	        xlsWb.write(response.getOutputStream());
	        xlsWb.close();
	        System.out.println("Excel 출력 완료");
	    } catch (Exception e) {
	        e.printStackTrace();
	        response.setHeader("Set-Cookie", "fileDownload=false; path=/");
	        System.out.println("Excel 출력 실패");
	    }
	 
	}

}


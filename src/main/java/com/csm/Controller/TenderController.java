package com.csm.Controller;

import com.csm.Model.TenderUpload;
import com.csm.Model.TenderUploadDocument;
import com.csm.Repository.TenderRepository;
import com.csm.Repository.TenderUploadDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Controller
public class TenderController {

	@Autowired
	private TenderRepository tenderRepository;

	@Autowired
	private TenderUploadDocumentRepository tenderUploadDocumentRepository;

	@GetMapping(value = "/dashboard")
	public String dashboard(Model model){
		System.out.println("Inside GetMapping Dashboard Method--------->>");
		return "dashboard";
	}
}

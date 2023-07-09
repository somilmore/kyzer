package com.example.web.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.ByteArrayOutputStream;

import org.json.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.model.Transaction;
import com.example.web.repository.TransactionRepository;
import com.example.web.service.PdfService;
import com.example.web.service.TransService;
import com.itextpdf.text.DocumentException;

@RestController
@RequestMapping("/rtta")
public class TransController {

	
}

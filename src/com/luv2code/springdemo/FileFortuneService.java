package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:/Users/Yusuf/source/javaRepos/spring-demo-annotations/fileFortune.txt";
	
	private List<String> theFortunes;
	
	private Random random = new Random();
	
	
	public FileFortuneService() {
		
	}
	
	@PostConstruct
	public void doMyStartupStaff() {
		System.out.println("FileFortune: inside doMyStartup PostConstruct ");

	File theFile = new File(fileName);
			
			System.out.println("Reading fortunes from file: " + theFile);
			System.out.println("File exists: " + theFile.exists());
			
			theFortunes = new ArrayList<String>();
			
			try (BufferedReader br = new BufferedReader(new FileReader(theFile))){
				
				String tempLine;
				while((tempLine = br.readLine()) != null) {
					theFortunes.add(tempLine);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	@PreDestroy
	public void doMyCleanupStaff() {
		System.out.println("FileFortune: inside doMyCleanup PreDestroy ");
	}
		
		@Override
		public String getFortune() {
			int index = random.nextInt(theFortunes.size());
			
			String tempFortune = theFortunes.get(index);
			
			
			return tempFortune;
	}
	

}

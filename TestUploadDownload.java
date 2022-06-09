package com.selenium;

public class TestUploadDownload {

	public static void main(String[] args) {

		UploadDownload objUploadDownload = new UploadDownload();
		objUploadDownload.intializationDriver("https://demoqa.com/upload-download");
		objUploadDownload.uploadFile();
        objUploadDownload.fileDownload();
	}

}

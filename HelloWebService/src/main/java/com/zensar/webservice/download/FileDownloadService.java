package com.zensar.webservice.download;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;


@Path("/download")
public class FileDownloadService {
	private static final String textFile = "D:/mark1.txt";
	private static final String imageFile = "D:/377518.jpg";
	private static final String pdfFile = "D:/serverStartup.pdf";
	
	@GET
	@Path("/text")
    public Response getTextFile()
    {
        File file = new File(textFile);
        ResponseBuilder builder = Response.ok(file);
        builder.header("Content-Disposition", "attachment; filename = download_mark1.txt");
        return builder.build();
    }
	
	@GET
	@Path("/image")
	@Produces("image/jpg")
	public Response getImageFile() {
		File file = new File(imageFile);
		ResponseBuilder builder = Response.ok(file);
		builder.header("Content-Disposition", "attachment; filename = download_377518.jpg");
		return builder.build();
	}
	
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getpdfFile() {
		File file = new File(pdfFile);
		ResponseBuilder builder = Response.ok(file);
		builder.header("Content-Disposition", "attachment; filename = download_serverStertup.pdf");
		return builder.build();
	}
}
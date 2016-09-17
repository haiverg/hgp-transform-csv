package com.redhat.training;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf="UNIX")

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4153990350690310533L;
	@DataField(pos = 1)
	private int id; 
	@DataField(pos = 2)
	private String description;
	@DataField(pos = 3)
	private double tax;
	@DataField(pos = 4)
	private double price;
}

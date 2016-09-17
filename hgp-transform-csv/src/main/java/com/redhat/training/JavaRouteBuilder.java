package com.redhat.training;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;

public class JavaRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		BindyCsvDataFormat dataFormat = new BindyCsvDataFormat("com.redhat.training");
		from("file:in?noop=true")
		.unmarshal(dataFormat)
		.to("jms:queue:orders");
	}

}

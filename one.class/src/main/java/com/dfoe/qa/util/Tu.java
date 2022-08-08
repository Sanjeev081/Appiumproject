package com.dfoe.qa.util;

import com.dfoe.qa.base.TestBase;

public class Tu extends TestBase{
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICITWAIT_WAIT=10;

	public void  switchtoframe() {
		driver.switchTo().frame("mainpanel");

	}


}

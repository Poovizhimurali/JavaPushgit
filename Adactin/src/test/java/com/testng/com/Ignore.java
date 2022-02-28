package com.testng.com;

import org.testng.annotations.Test;

public class Ignore {

		@Test(invocationCount = 6)
		public void Amethod() {
			System.out.println("this is method A");

		}
		@Test
		public void Bmethod() {
			System.out.println("this is method B");

		}
		
		@org.testng.annotations.Ignore
		@Test
		public void Cmethod() {
			System.out.println("this is method C");

		}
		@Test(enabled = false)
		public void Dmethod() {
			System.out.println("this is method D");

		}
	


}

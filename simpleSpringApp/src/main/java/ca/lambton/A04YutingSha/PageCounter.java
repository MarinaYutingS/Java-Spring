package ca.lambton.A04YutingSha;

import lombok.Data;

//a04 
//c0842810- yuting sha
@Data
public class PageCounter {
	
	private Integer pageCounter = 0;
	
	//has a method to increment the integer
	public void incresePageCounts() {
		this.pageCounter++;
	}
	
	//has a method to get the current pageCount
	public Integer getPageCount() {
		return this.pageCounter;
	}
	
}

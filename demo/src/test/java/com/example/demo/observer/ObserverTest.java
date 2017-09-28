package com.example.demo.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ObserverTest {
	
	@Test
	public void observerTest() {
		News news = new News();
		
		Reader john = new Reader("john"); // 新增讀者
		Reader mary = new Reader("mary");
		Reader bill = new Reader("bill");
		
		john.subscribe(news); //訂閱新聞
		mary.subscribe(news);
		bill.subscribe(news);
		
		news.notiffy(false);
	}
}

package com.interf.test;

import com.interf.http.HttpUtil;

public class HttpTest {

	public static void main(String[] args) {
		String content = HttpUtil.submitGet("http://www.baidu.com", "");
		if (content.contains("hao123")) {
			System.out.println("包含验证值,测试成功");
		} else {
			System.out.println("没有包含验证值,测试失败");
		}
	}

}

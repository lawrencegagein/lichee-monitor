/*
 *  Copyright@2014 GageIn Inc. All rights reserved.
 *  Email : hust.xzj@gmail.com 
 */
package org.upas.lichee.client;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Xiong Zhijun
 * @date Nov 18, 2014
 */
public class PathUtilsTest {

	@Test
	public void testJoin() {
		assertEquals("/", PathUtils.join());
		assertEquals("/", PathUtils.join("", ""));
		assertEquals("/", PathUtils.join("/", ""));
		assertEquals("/", PathUtils.join("/", "/"));
		assertEquals("/", PathUtils.join("/", null));

		assertEquals("/abc/cde/abc", PathUtils.join("/", "abc", "cde", "abc"));
		assertEquals("/abc/cde/abc",
				PathUtils.join("/", "abc/", "/cde/", "/abc/"));
		assertEquals("/abc/cde/abc",
				PathUtils.join("/", "abc/", "/cde/", "/abc"));
		assertEquals("/abc/cde/abc",
				PathUtils.join("/", null, "", "/", "abc/", "/cde/", "/abc"));
	}

}

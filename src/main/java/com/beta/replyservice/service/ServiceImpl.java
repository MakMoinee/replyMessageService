package com.beta.replyservice.service;

import org.springframework.util.DigestUtils;

public class ServiceImpl implements ServiceIntf {

	@Override
	public String processData(String msg) {
		msg = msg.trim();
		if (msg.length() == 0)
			return "";

		String res = "";
		// split the message to array by -
		String[] arrMsg = msg.split("-");
		// first array would determine the rules
		char[] firstWord = arrMsg[0].toCharArray();
		// second array which is the actual message
		String word = arrMsg[1];

		for (int i = 0; i < firstWord.length; i++) {
			if (res.length() > 0)
				// replace the word with last modified message stored in res
				word = res;

			// process the rules
			switch (firstWord[i]) {
			case '1':
				res = this.reverseData(word);
				break;
			case '2':
				res = this.encodeData(word);
				break;
			}
		}

		return res;
	}

	@Override
	public String reverseData(String msg) {
		StringBuilder builder = new StringBuilder(msg);
		builder.reverse();
		String data = builder.toString();
		return data;
	}

	@Override
	public String encodeData(String msg) {
		String md5Hex = DigestUtils.md5DigestAsHex(msg.getBytes());
		return md5Hex;
	}

}

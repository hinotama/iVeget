package edu.fpt.group4.common;

import org.apache.commons.validator.GenericValidator;

/**
 * Class validate dữ liệu
 * 
 * @author LeDN
 *
 */
public class Validator {

	/**
	 * Method validate dữ liệu
	 * 
	 * @param text
	 * @return true hoặc false
	 */
	public boolean validate(String text) {

		Boolean isValid = true;

		/*
		 * Nếu string nhập vào là blank hoặc null thì trả về false
		 */
		if (GenericValidator.isBlankOrNull(text)) {
			isValid = false;
		}

		/*
		 * Nếu string nhập vào lớn hơn 15 kí tự thì trả về false
		 */
		if (!GenericValidator.maxLength(text, 15)) {
			isValid = false;
		}

		/*
		 * Nếu string nhập vào ngắn hơn 3 kí tự thì trả về false
		 */
		if (!GenericValidator.minLength(text, 3)) {
			isValid = false;
		}

		return isValid;

	}

}

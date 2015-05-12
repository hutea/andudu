package com.hydom.auxiliary.service;

import com.hydom.auxiliary.ebean.ShortMessage;
import com.hydom.dao.DAO;

public interface ShortMessageService extends DAO<ShortMessage> {
	/**
	 * ������֤��
	 * 
	 * @param phone
	 *            : �绰����
	 * @param code
	 *            : ��֤��
	 * @param content
	 *            : ������������
	 * @return
	 */
	public boolean sendCode(String phone, String code, String content);

	/**
	 * 
	 * ͨ���ֻ��ҵ����һ�����Ͷ��ŵ���֤��
	 * 
	 * @param phone
	 * @return:���ʱ�����أ���CODETIMEOUT��
	 */
	public String findCode(String phone);

}

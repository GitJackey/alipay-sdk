package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.agent.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-22 17:53:27
 */
public class AlipayOpenPublicLifeAgentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6599873892755394411L;

	/** 
	 * 外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}

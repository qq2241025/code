package com.mapabc.gater.lbsgateway.bean;

// Generated by MyEclipse Persistence Tools

import java.util.Date;

/**
 * TFlowVolume generated by MyEclipse Persistence Tools
 */
public class TFlowVolume extends AbstractTFlowVolume implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TFlowVolume() {
	}

	/** full constructor */
	public TFlowVolume(String deviceId, Long flowSize, String actionType,
			String linkType, Date crtDate) {
		super(deviceId, flowSize, actionType, linkType, crtDate);
	}

}

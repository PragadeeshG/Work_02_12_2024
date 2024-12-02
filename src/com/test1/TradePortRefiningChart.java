package com.test1;

public class TradePortRefiningChart {
	private Integer dataPortfolioCode;
	private Integer tradePortRefiningId;
	private String tradePortRefiningBudgetIndicator;
	private String tradePortRefiningSheet;
	private String tradePortRefiningControlFlag;
	private String tradePortRefiningDesc;
	private String tradePortRefiningShortDesc;
	private String tradePortRefiningType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TradePortRefiningChart() {

	}

	public TradePortRefiningChart(Integer dataPortfolioCode, Integer tradePortRefiningId,
			String tradePortRefiningBudgetIndicator, String tradePortRefiningSheet, String tradePortRefiningControlFlag,
			String tradePortRefiningDesc, String tradePortRefiningShortDesc, String tradePortRefiningType,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.dataPortfolioCode = dataPortfolioCode;
		this.tradePortRefiningId = tradePortRefiningId;
		this.tradePortRefiningBudgetIndicator = tradePortRefiningBudgetIndicator;
		this.tradePortRefiningSheet = tradePortRefiningSheet;
		this.tradePortRefiningControlFlag = tradePortRefiningControlFlag;
		this.tradePortRefiningDesc = tradePortRefiningDesc;
		this.tradePortRefiningShortDesc = tradePortRefiningShortDesc;
		this.tradePortRefiningType = tradePortRefiningType;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getDataPortfolioCode() {
		return dataPortfolioCode;
	}

	public void setDataPortfolioCode(Integer dataPortfolioCode) {
		this.dataPortfolioCode = dataPortfolioCode;
	}

	public Integer getTradePortRefiningId() {
		return tradePortRefiningId;
	}

	public void setTradePortRefiningId(Integer tradePortRefiningId) {
		this.tradePortRefiningId = tradePortRefiningId;
	}

	public String getTradePortRefiningBudgetIndicator() {
		return tradePortRefiningBudgetIndicator;
	}

	public void setTradePortRefiningBudgetIndicator(String tradePortRefiningBudgetIndicator) {
		this.tradePortRefiningBudgetIndicator = tradePortRefiningBudgetIndicator;
	}

	public String getTradePortRefiningSheet() {
		return tradePortRefiningSheet;
	}

	public void setTradePortRefiningSheet(String tradePortRefiningSheet) {
		this.tradePortRefiningSheet = tradePortRefiningSheet;
	}

	public String getTradePortRefiningControlFlag() {
		return tradePortRefiningControlFlag;
	}

	public void setTradePortRefiningControlFlag(String tradePortRefiningControlFlag) {
		this.tradePortRefiningControlFlag = tradePortRefiningControlFlag;
	}

	public String getTradePortRefiningDesc() {
		return tradePortRefiningDesc;
	}

	public void setTradePortRefiningDesc(String tradePortRefiningDesc) {
		this.tradePortRefiningDesc = tradePortRefiningDesc;
	}

	public String getTradePortRefiningShortDesc() {
		return tradePortRefiningShortDesc;
	}

	public void setTradePortRefiningShortDesc(String tradePortRefiningShortDesc) {
		this.tradePortRefiningShortDesc = tradePortRefiningShortDesc;
	}

	public String getTradePortRefiningType() {
		return tradePortRefiningType;
	}

	public void setTradePortRefiningType(String tradePortRefiningType) {
		this.tradePortRefiningType = tradePortRefiningType;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
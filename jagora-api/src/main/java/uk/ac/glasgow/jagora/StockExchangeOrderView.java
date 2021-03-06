package uk.ac.glasgow.jagora;

public interface StockExchangeOrderView {
	/**
	 * Places a buy order on the stock exchange. If this is the first order for
	 * a stock then placing the order creates the market for that stock on the
	 * exchange.
	 *
	 * @param buyOrder
	 */
	public void placeBuyOrder(BuyOrder buyOrder);

	/**
	 * Places a sell order on the stock exchange. If this is the first order for
	 * a stock then placing the order creates the market for that stock on the
	 * exchange.
	 *
	 * @param buyOrder
	 */
	public void placeSellOrder(SellOrder sellOrder);

	public void cancelBuyOrder(BuyOrder buyOrder);

	public void cancelSellOrder(SellOrder sellOrder);

	/**
	 * @param stock
	 * @return the lowest priced offer for the specified stock on this exchange,
	 *         or null if no offer exists or the exchange does not trade the
	 *         specified stock.
	 */
	public Double getBestOffer(Stock stock);

	/**
	 *
	 * @param stock
	 * @return the highest priced bid for the specified stock on this exchange,
	 *         or null if no bid exists or the exchange does not trade the
	 *         specified stock.
	 */
	public Double getBestBid(Stock stock);
}

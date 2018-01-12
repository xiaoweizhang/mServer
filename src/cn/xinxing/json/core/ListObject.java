package cn.xinxing.json.core;

import java.util.List;

public class ListObject extends AbstractJsonObject {

	// 列表对象
	private List<?> items;

	public List<?> getItems() {
		return items;
	}

	public void setItems(List<?> items) {
		this.items = items;
	}

}

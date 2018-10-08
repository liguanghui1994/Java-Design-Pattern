package strategy.hander;

import strategy.sort_interface.Sort;

/**
 * 排序的策略选择类
 * @author guanghui_li
 *
 */
public class ArrayHander {

	private Sort sort;

	public ArrayHander(Sort sort) {
		super();
		this.sort = sort;
	}
	
	public int[] sort(int[] arr) {
		return sort.sort(arr);
	}
}

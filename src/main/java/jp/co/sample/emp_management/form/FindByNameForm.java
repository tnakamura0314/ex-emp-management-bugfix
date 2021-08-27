package jp.co.sample.emp_management.form;

/**
 * 名前で曖昧検索する時に使用するフォーム.
 * 
 * @author nakamuratomoya
 *
 */
public class FindByNameForm {

	/** 検索名 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FindByNameForm [name=" + name + "]";
	}

}

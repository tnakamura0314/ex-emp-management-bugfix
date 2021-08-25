package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {

	/** 名前 */
	@NotBlank(message = "名前は必須です")
	private String name;

	/** メールアドレス */
	@NotBlank(message = "メールアドレスは必須です")
	@Email(message = "Emailの形式が不正です")
	private String mailAddress;

	/** パスワード */
	@NotBlank(message = "パスワードは必須です")
	@Size(min = 6, max = 12, message = "パスワードは6文字以上12文字以内で設定してください")
	private String password;

	/** パスワード */
	@NotBlank(message = "確認用パスワードは必須です")
	@Size(min = 6, max = 12, message = "確認用パスワードは6文字以上12文字以内で設定してください")
	private String confirmation_password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmation_password() {
		return confirmation_password;
	}

	public void setConfirmation_password(String confirmation_password) {
		this.confirmation_password = confirmation_password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", confirmation_password=" + confirmation_password + "]";
	}

}
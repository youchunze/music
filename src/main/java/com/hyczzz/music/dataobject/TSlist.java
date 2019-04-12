package com.hyczzz.music.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_slist")
public class TSlist  implements Serializable {

	private static final long serialVersionUID = -1097728405539205761L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "list_id")
	private Long listId;

	@Column(name = "list_name")
	private String listName;

	@Column(name = "list_pic")
	private String listPic;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "belong_site")
	private Long belongSite;

}

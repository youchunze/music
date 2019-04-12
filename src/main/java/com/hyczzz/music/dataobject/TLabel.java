package com.hyczzz.music.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_label")
public class TLabel  implements Serializable {

	private static final long serialVersionUID = 7524538300175077576L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "label_id")
	private Long labelId;

	@Column(name = "label_name")
	private String labelName;

}

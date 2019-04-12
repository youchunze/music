package com.hyczzz.music.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "slist_song")
public class SlistSong  implements Serializable {

	private static final long serialVersionUID = 917709535513637937L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_id")
	private Long tId;

	@Column(name = "list_id")
	private Long listId;

	@Column(name = "sing_id")
	private Long singId;

}

package com.fyp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provisionalvotes")
public class provisionalvotes {

	public provisionalvotes(int id, long ccnic, byte[] vote_no) {
		super();
		this.id = id;
		this.ccnic = ccnic;
		this.vote_no = vote_no;
	}
	public provisionalvotes(){}
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int id;
	@Column
	private long ccnic;
	@Column
	private byte[]vote_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getCcnic() {
		return ccnic;
	}
	public void setCcnic(long ccnic) {
		this.ccnic = ccnic;
	}
	public byte[] getVote_no() {
		return vote_no;
	}
	public void setVote_no(byte[] vote_no) {
		this.vote_no = vote_no;
	}
	
}

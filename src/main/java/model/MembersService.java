package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class MembersService {
	@Autowired
	private MembersDAO membersDao;
	
	public List<MembersBean> select(MembersBean bean){
		List<MembersBean> result = null;
		if(bean!=null && bean.getMemberId()!=null && !bean.getMemberId().equals(0)) {
			MembersBean temp = membersDao.select(bean.getMemberId());
			if(temp!=null) {
				result = new ArrayList<MembersBean>();
				result.add(temp);
			}
		}else {
			result = membersDao.select();
		}	
		return result;
	};
	public MembersBean insert(MembersBean bean){
		MembersBean result = null;
		if(bean!=null && bean.getMemberId()!=null) {
//			//這些可以是空直
//			if(bean.getMemberLastname()==null) {
//				bean.setMemberLastname("");
//			};
//			if(bean.getMemberFirstname()==null) {
//				bean.setMemberFirstname("");
//			};
//			if(bean.getMemberAddr()==null) {
//				bean.setMemberAddr("");
//			};
//			if(bean.getMemberGender()==null) {
//				bean.setMemberGender("female");
//			};
//			if(bean.getCreateDate()==null) {
//				bean.setCreateDate(new Date(11, 11, 11));
//			};
//			if(bean.getUpdateDate()==null) {
//				bean.setUpdateDate(new Date(11, 11, 11));
//			};
//			if(bean.getCreateUser()==null) {
//				bean.setCreateUser("");
//			};
//			if(bean.getUpdateUser()==null) {
//				bean.setUpdateUser("");
//			};
//			if(bean.getMemberAccouunt()==null) {
//				bean.setMemberAccouunt("");
//			};
//			if(bean.getMemberBirth()==null) {
//				bean.setMemberBirth(new Date(11, 11, 11));
//			};
//			if(bean.getMemberNickname()==null) {
//				bean.setMemberNickname("");
//			};
//			if(bean.getMemberEmail()==null) {
//				bean.setMemberEmail("");
//			};
//			if(bean.getMemberPassword()==null) {
//				bean.setMemberPassword("");
//			};
//			if(bean.getMemberTel()==null) {
//				bean.setMemberTel("");
//			};
//			
			//這些可以是空直
			System.out.println(bean.getMemberId() + " from Members service");
			result = membersDao.insert(bean);
		}	
		return result;
	};
	
	public MembersBean update(MembersBean bean){
		MembersBean result = null;
		if(bean!=null && bean.getMemberId()!=null) {	
			result = membersDao.update(bean.getMemberLastname(),
					bean.getMemberFirstname(),
					bean.getMemberNickname(),
					bean.getMemberEmail(),
					bean.getMemberTel(),
					bean.getMemberAddr(),
					bean.getMemberBirth(),
					bean.getMemberId());				
		}	
		return result;
	};
	
	public boolean delete(MembersBean bean) {
		boolean result = false;
		if(bean!=null && bean.getMemberId()!=null) {
			result = membersDao.delete(bean.getMemberId());
		}
		return result;
	};
	

}

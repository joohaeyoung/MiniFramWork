package spms.controls;

import java.util.Map;

import DataBinding.DataBinding;
import spms.dao.MemberDao;

public class MemberDeleteController implements Controller, DataBinding {

	MemberDao memberDao;
	
	public MemberDeleteController setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		// TODO Auto-generated method stub
		return new Object[] {
				"no",Integer.class
		};
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
				
		memberDao.delete((int)model.get("no"));
		
		return "redirect:list.do";
	}
}

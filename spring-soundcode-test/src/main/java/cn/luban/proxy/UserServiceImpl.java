package cn.luban.proxy;

public class UserServiceImpl implements UserService{
	@Override
	public void add() {
		System.out.println("add============>");
	}

	@Override
	public void delect(Integer id) {
		System.out.println("delect=====>"+id);
	}
}

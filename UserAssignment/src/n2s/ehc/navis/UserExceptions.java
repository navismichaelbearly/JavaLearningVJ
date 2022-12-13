package n2s.ehc.navis;

class InvalidUserId extends Exception {
	InvalidUserId(String msg) {
		super(msg);
	}
	
}

class UserIdNotFound extends Exception {
	UserIdNotFound(String msg) {
		super(msg);
	}
}


class InvalidEntry extends Exception {
	InvalidEntry(String msg) {
		super(msg);
	}
}

package com.oracle.javacert.professional.chapter01._05nestedclasses.inner;

public class CaseOfThePrivateInterface {
	private interface Secret {
		public void shh();
	}

	class DontTell implements Secret {
		@Override
		public void shh() {
			// TODO Auto-generated method stub
		}
	}
}

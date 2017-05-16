package com.atf.keybinder.interfaces.types;

import com.atf.keybinder.interfaces.Executor;

public interface PropertyBinder<T> {
	void bindAction(T prop, Executor action);
}

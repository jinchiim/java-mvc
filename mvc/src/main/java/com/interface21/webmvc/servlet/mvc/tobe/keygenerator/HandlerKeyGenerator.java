package com.interface21.webmvc.servlet.mvc.tobe.keygenerator;

import com.interface21.webmvc.servlet.mvc.tobe.HandlerKey;

import java.lang.reflect.Method;

public interface HandlerKeyGenerator {

    boolean hasAnnotation(Method method);

    HandlerKey[] makeKeys(Method method);
}

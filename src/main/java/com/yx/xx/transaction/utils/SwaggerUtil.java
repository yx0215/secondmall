package com.yx.xx.transaction.utils;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import springfox.documentation.RequestHandler;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class SwaggerUtil {
    public SwaggerUtil() {
    }

    public static Predicate<RequestHandler> basePackages(final List<String> basePackages) {
        return (input) -> {
            return (Boolean)declaringClass(input).transform(handlerPackage(basePackages)).or(true);
        };
    }

    private static Function<Class<?>, Boolean> handlerPackage(final List<String> basePackages) {
        return (input) -> {
            Iterator var2 = basePackages.iterator();

            boolean isMatch;
            do {
                if (!var2.hasNext()) {
                    return false;
                }

                String strPackage = (String)var2.next();
                isMatch = input.getPackage().getName().startsWith(strPackage);
            } while(!isMatch);

            return true;
        };
    }

    private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
        return Optional.fromNullable(input.declaringClass());
    }
}

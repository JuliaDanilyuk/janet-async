package io.techery.janet.async.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.techery.janet.async.PendingResponseMatcher;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface PendingResponse {

    Class<? extends PendingResponseMatcher> value();

    long timeout() default 0;
}

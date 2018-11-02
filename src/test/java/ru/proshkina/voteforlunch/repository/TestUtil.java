package ru.proshkina.voteforlunch.repository;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtil {

    public static <T> void assertMatch(T actual, T expected, String... ignoringFields) {
        assertThat(actual).isEqualToIgnoringGivenFields(expected, ignoringFields);
    }

    public static <T> void assertMatch(Iterable<T> actual, Iterable<T> expected, String... ignoringFields) {
        assertThat(actual).usingElementComparatorIgnoringFields(ignoringFields).isEqualTo(expected);
    }

}
package org.grjug.bootlab.domain;

/**
 * Status property: Integer (1 Green, 2 Red, 3 Success, 4 Failed). From:
 * https://launchlibrary.net/1.2/docs/api.html#launch
 */
public enum LaunchStatus {

    GREEN(1), RED(2), SUCCESS(3), FAILED(4);

    private final int value;

    public static LaunchStatus valueOf(int value) {

        for (LaunchStatus status : values()) {
            if (status.value == value) {
                return status;
            }
        }

        throw new IllegalArgumentException("No LaunchStatus for int value: " + value);
    }

    private LaunchStatus(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }
}

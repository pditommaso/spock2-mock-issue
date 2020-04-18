package spock.mock.issue

class MyMap implements Map<String,Object> {

    @Delegate
    private Map<String,Object> target

    MyMap(Map entries) {
        this.target = entries
    }
}

package spock.mock.issue

import spock.lang.Specification

class MyMapTest extends Specification {

    def 'should be ok' () {
        given:
        def ctx = new MyMap([:])

        expect:
        ctx.foo == null
    }

    def 'should mock map' () {
        given:
        def ctx = Mock(MyMap)

        expect:
        ctx.foo == null
    }


}

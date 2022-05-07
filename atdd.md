트칭구 추천으로 youtube에서 본 [ATDD](https://www.youtube.com/watch?v=affikK1obXw) 영상.


인상 깊었던 내용은
- service, repository, impl 등을 inner class로 만들어서 테스트 후 외부 클래스로 뺌
- mocking은 필요할 때만 사용, 오히려 mock 구현이 더 길어질 경우 실제 구현이 더 낫다.
- integration test는 bulid 할 때마다 돌리지 않고, ide 상에서만 테스트 용
- inner class를 static으로 처리하지 않으면 gc가 돌지 않는다.


ATDD는 
- Assert부터 작성한다.
- arrange, act, assert의 3개를 딴 듯?


느낀점
- 아직 TDD에 익숙하지 못한데 저렇게 빠르게 TDD를 하는 건 시간이 더 걸릴 거 같다.
- 다 생각하고 하는 것보다 바로바로 테스트를 돌려가면서 검증하며 하는게 더 낫겠지?

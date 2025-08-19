# 15시 55시작 -> 로직은 생각해냈지만, slice 적용에 대해 어려움을 겪어 처음에 시간이 좀 걸렸다.
# 그리고 모든 로직이 맞다고 생각하여 테스트를 돌렸는데 계속 테스트가 틀렸다고 떠가지고 그 이유를 찾으려고 했으나
# 결국 찾지 못하여 GPT에게 디버깅 요청을 했다. -> 원인은 마지막 문자열 묶음을 붙이지 않아서였다....

# 1. 문자열 길이 만큼 탐색
# 2. 문자열을 i개 단위로 압축
# 3. 압축된 문자열 길이 구하기 , 최소 문자열 길이를 저장
def solution(s):
    answer = len(s)

    for split in range(1, len(s)):
        afterString = ""
        tmp_ch = (s[0:split])
        count = 1
        for i in range(split, len(s), split):  # 문자열 길이 자르기
            if tmp_ch == s[i:i + split]:  # 이전 문자열과 같다면
                count += 1
            else:
                if count > 1:
                    afterString += str(count) + tmp_ch
                else:
                    afterString += tmp_ch
                tmp_ch = s[i:i + split]  # 다음 문자열로 변경
                count = 1

        afterString += (str(count) if count > 1 else "") + tmp_ch
        answer = min(len(afterString), answer);

    return answer;
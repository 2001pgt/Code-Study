-- 코드를 입력하세요
SELECT 
    A.REST_ID, 
    A.REST_NAME, 
    A.FOOD_TYPE, 
    A.FAVORITES, 
    A.ADDRESS, 
    ROUND(AVG(B.REVIEW_SCORE), 2) AS REVIEW_SCORE -- 평균 점수 계산
FROM REST_INFO AS A                       -- 별칭 'A' 추가
INNER JOIN REST_REVIEW AS B ON A.REST_ID = B.REST_ID -- JOIN이 WHERE보다 위로!
WHERE A.ADDRESS LIKE '서울%'               -- 필터링
GROUP BY A.REST_ID                        -- 식당별로 그룹화 (필수)
ORDER BY REVIEW_SCORE DESC, A.FAVORITES DESC; -- 정렬 (선택 사항)
import scissors from "../img/0.png";
import rock from "../img/1.png";
import paper from "../img/2.png";
function Practice1(props){
    const [playerImg,setPlayerImg] = useState(); 
    const onClickResult = (player) =>{
        // player의 값으로 이미지 변경
        // computer의 값으로 이미지 변경 ,0~2 의 랜덤값 저장
        let computer = Math.floor(Math.random()*3);
        // 결과 글자 바꾸기
    }
    return(
        <div>
            <button onClick={()=>onClickResult(0)}>✌</button>
            <button onClick={()=>onClickResult(1)}>👊</button>
            <button onClick={()=>onClickResult(2)}>🖐</button>
        </div>
    );
}
export default Practice1;
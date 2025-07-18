import { useEffect, useRef, useState } from "react";
import scissors from "../img/0.png";
import rock from "../img/1.png";
import paper from "../img/2.png";
function Practice1(props){
    const [playerImg,setPlayerImg] = useState(scissors);
    const [computerImg, setComputerImg] = useState(scissors);
    const [result, setResult] = useState("버튼을 눌러주세요~~");
    const [history, setHistory] = useState([]);
    const playerRef = useRef(null);
    const computerRef = useRef(null);
    const firstRender = useRef(true);
    useEffect(()=>{
        if(firstRender.current){
            firstRender.current = false;
            return;
        }
        const list = ["✌","👊","🖐"];
        setHistory((history)=>[`${list[playerRef.current]}vs${list[computerRef.current]} ${result}` , ...history])
    },[result])

    const onClickResult = (player) =>{
        // player의 값으로 이미지 변경
        playerRef.current = player;
        setPlayerImg(changeImg(playerRef.current));
        // computer의 값으로 이미지 변경 ,0~2 의 랜덤값 저장
        computerRef.current = Math.floor(Math.random()*3);
        setComputerImg(changeImg(computerRef.current));
        // 결과 글자 바꾸기
        let num = playerRef.current - computerRef.current;
        if(num === 0){
            num = "비겼습니다.";
        }else if(num === -2 || num === 1){
            num = "이겼습니다.";
        }else{
            num = "졌습니다.";
        }
        console.log(num);
        setResult(num);
    }
    const changeImg=(data)=>{
        if(data===0){return scissors;}
        else if(data===1){return rock;}
        else if(data===2){return paper;}
    }
    return(
        <div>
            <div style={{textAlign:"center"}}>
                {result}
            </div>
            <div style={{textAlign:"center"}}>
                <img src={playerImg} alt="player"/>
                VS
                <img src={computerImg} alt="computer"/>
            </div>
            <div style={{textAlign:"center"}}>
                <button onClick={()=>onClickResult(0)}>✌</button>
                <button onClick={()=>onClickResult(1)}>👊</button>
                <button onClick={()=>onClickResult(2)}>🖐</button>
            </div>
            <div>
                {history.map((data)=>{
                    return <p style={{textAlign:"center"}}>{data}</p>;
                })}
            </div>
        </div>
    );
}
export default Practice1;
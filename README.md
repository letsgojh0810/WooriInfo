# WOORI INFO - 학생 정보 관리 시스템 🎓

## 📝 프로젝트 소개
WOORI INFO는 학생들을 위한 정보 관리 시스템입니다. 학생들의 기본 정보, 목표, 스터디 희망 분야 등을 관리하고, 등하교 메이트 매칭 기능을 제공합니다.

## 🌟 주요 기능
1. **전체 사용자 정보 조회**
   - 전체 사용자의 모든 프로필 정보를 출력한다.

2. **특정 사용자 정보 조회**
   - 이름으로 사용자 프로필 정보 조회
   - 등하교 메이트 희망자 정보 조회

3. **내 정보 관리**
   - 개인 프로필 정보 추가 
   - 개인 프로필 정보 조회 및 수정 삭제
   - 노트북 번호를 통한 고유 식별

4. **보안**
   - 정보 수정/삭제 시 비밀번호 인증
   - BCrypt를 활용한 비밀번호 암호화

## 🛠 기술 스택
- **언어:** Java
- **데이터베이스:** MySQL
- **보안:** BCrypt
- **빌드 도구:** Maven
- **개발 환경:** 
  - Spring Tool Suite (STS)
  - DBeaver
  - Git
  - Notion
- **라이브러리:**
  - Lombok
  - JDBC
  - jBCrypt

## 📁 프로젝트 구조
```plaintext
src/  
├── 📂 info/  
│   ├── 📂 controller/  
│   │   └── 🎮 MemberController.java  
│   ├── 📂 exception/  
│   │   └── ⚠️ NotExistException.java  
│   ├── 📂 model/  
│   │   ├── 🛠️ MemberDAO.java  
│   │   ├── 📂 dto/  
│   │   │   ├── 📄 MemberDTO.java  
│   │   │   ├── 📄 MemberInfoDTO.java  
│   │   │   ├── 📄 CommuteMateDTO.java  
│   │   │   └── 👑 Role.java  
│   │   └── 📂 util/
│   │       └── ⚙️ DBUtil.java  
│   └── 📂 view/  
│       ├── 🖥 RunningStartView.java  
│       └── 📺 RunningEndView.java  
```

<details>
  <summary><b>팀원의 첫인상과 식사 후 현인상</b></summary>

### 😊 지수근
- 최다영 : 성격이 온화해 보이셨다. → 의외로 활발하시고 첫 인상처럼 성격이 온화하시다.
- 최윤정 : 차분하고 신중해 보였다. → 맛집 얘기할 때 진심이 느껴진다.
- 한정현 : 책임감이 강해 보였다. → 생각보다 말씀도 많으시고 재밌으시다.

### 😁 최다영

- 지수근 : 친숙한 느낌이 들었다. → 비슷한 점이 많아 더욱 친숙해졌고 차분하신 것 같다.
- 최윤정 : 똑부러지는 성격인 것 같다. → 밝고 또렷한 목소리가 귀에 콕콕 박힌다.
- 한정현 : 부처같은 느낌을 받았다. → 활발하시고 눈치가 빠른 것 같았다.

### 👩‍💻 최윤정

- 지수근 : 똑똑하고 꼼꼼하실 것 같다. → 비슷하다. 그리고 닭강정.. 나만 많이 먹은 거 봤다. 배려심도 많은 분 같다.
- 최다영 : 낯이 익은데.. 아까 오티 때 봐서 그런가? → 같은 대학교셨다! 눈송이 너무 반갑다. 대화할 때 긍정 에너지가 느껴진다.
- 한정현 : 뭔가 장난기가 있으실 것 같다. → MBTI 듣고 나니 첫인상이 맞을 수도 있겠다. 옆에서 상태 체크도 먼저 해주시고 친절하시다.

### 🐱‍👤한정현

- 지수근 :  스마트한 이미지가 있다. → 굉장히 친절하시고 모르는걸 잘 알려주신다.
- 최윤정 : 밝고 성격이 좋을 것 같다. → 꼼꼼하고 똑순이 같다.
- 최다영 :  착하시고 뭔가 다람쥐 같은 이미지가 있다. → 착한 다람쥐 같다.
</details>
<br>
<details>
  <summary><b>Git Bash SSH 설정 및 회고</b></summary>
<br>

# 👀 회고록
## 💥 발생한 문제

상황

- SSH 키 생성하고 공개 키 Github에 등록했나요? yes
- git config 설정했나요? yes

그런데, Github에 Push가 되지 않았다.

## ✔ 해결한 방법

git config로 설정했던 name, email을 unset 해준 뒤 다시 재등록해주니 push가 되었다. 혹시 오타가 있을 수 있으니, 본인의 깃허브에 들어가 복사해서 붙여넣기 하는 것을 추천한다.

<br>

# 📌 Git Bash로 SSH Key 설정 및 Github 연동 과정 정리

## 1. SSH 키 생성 및 등록

### 명령어 실행

```bash

# 홈 디렉토리로 이동

cd ~

# SSH 키 생성

ssh-keygen

# SSH 키가 저장된 디렉토리로 이동

cd ~/.ssh

# 디렉토리 내 파일 목록 확인

ls -la

# 공개 키 파일 내용 확인 및 복사

cat id_ed25519.pub

```

### GitHub에 SSH 키 등록

1. GitHub → **Settings > SSH and GPG keys**로 이동.

2. **New SSH Key** 클릭.

3. 위 명령어에서 복사한 공개 키(`id_ed25519.pub`) 내용을 붙여넣고 저장.

## 2. Git 작업 흐름

### 명령어 실행

```bash

# 레포지토리 클론

git clone git@github.com:lalalarr/WooriInfo.git

# 클론한 디렉토리로 이동

cd /c/WooriInfo

# 파일 변경 후 추가

git add .

# 변경사항 확인

git diff  # 탈출은 'q'

# 변경사항 커밋

git commit -m "[Docs] Update README"

# 변경사항 푸시

git push origin main

```

## **3. Git 설정 초기화 및 재설정**

### **기존 설정 삭제**

```bash

git config --unset --global user.name

git config --unset --global user.email

```

### 현재 설정 확인

```bash

git config --list

```

### 새로운 설정 등록

```bash

git config --global user.name 깃허브아이디

git config --global user.email 깃허브에연동된이메일

```

<br>

# 📖 참고 자료

[https://hoozy.tistory.com/entry/GIT-GIT-BASH로-SSH-연결-후-프로젝트-PUSH](https://hoozy.tistory.com/entry/GIT-GIT-BASH%EB%A1%9C-SSH-%EC%97%B0%EA%B2%B0-%ED%9B%84-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-PUSH)
</details>
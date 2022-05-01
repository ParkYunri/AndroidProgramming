package com.cookandroid.aboutme;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.annotation.Nullable;

public class FourthActivity extends Activity {
    Button btnTxt, btnOst, btnReturn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
        setTitle("즐겨보던 영화들");

        Gallery gallery = (Gallery)findViewById(R.id.gallery1);
        MyGalleryAdapter adapter = new MyGalleryAdapter(this);
        gallery.setAdapter(adapter);

        btnOst = (Button)findViewById(R.id.btnOst);
        btnReturn = (Button)findViewById(R.id.btnReturn1);

        btnOst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FifthActivity.class);
                startActivity(intent);
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public class MyGalleryAdapter extends BaseAdapter{
        Context context;
        Integer [] posterID = {R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04, R.drawable.mov05,
                R.drawable.mov06, R.drawable.mov07, R.drawable.mov08, R.drawable.mov09, R.drawable.mov10};
        public MyGalleryAdapter(Context c){
            context = c;
        }

        public int getCount(){
            return posterID.length;
        }

        public Object getItem(int arg0){
            return null;
        }

        public long getItemId(int posiiton){
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new Gallery.LayoutParams(200, 300));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(5,5,5,5);
            imageView.setImageResource(posterID[position]);

            final int pos = position;
            btnTxt = (Button)findViewById(R.id.btnTxt);

            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ImageView ivPoster = (ImageView)findViewById(R.id.ivPoster);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    switch(pos){
                        case 0:
                            ivPoster.setImageResource(posterID[0]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("너의 이름은");
                                    dlg.setMessage("아직 만난 적 없는 너를, 찾고 있어 천년 만에 다가오는 혜성 기적이 시작된다 도쿄에 사는 소년 ‘타키’와 시골에 사는 소녀 ‘미츠하’는 서로의 몸이 뒤바뀌는 신기한 꿈을 꾼다 낯선 가족, 낯선 친구들, 낯선 풍경들... 반복되는 꿈과 흘러가는 시간 속, 마침내 깨닫는다 우리, 서로 뒤바뀐 거야? 절대 만날 리 없는 두 사람 반드시 만나야 하는 운명이 되다 서로에게 남긴 메모를 확인하며 점점 친구가 되어가는 ‘타키’와 ‘미츠하’ 언제부턴가 더 이상 몸이 바뀌지 않자 자신들이 특별하게 이어져있었음을 깨달은 ‘타키’는 ‘미츠하’를 만나러 가는데... 잊고 싶지 않은 사람 잊으면 안 되는 사람 너의 이름은?");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 1:
                            ivPoster.setImageResource(posterID[1]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("비긴어게인");
                                    dlg.setMessage("싱어송라이터인 ‘그레타’(키이라 나이틀리)는 남자친구 ‘데이브’(애덤 리바인)가 메이저 음반회사와 계약을 하게 되면서 뉴욕으로 오게 된다. 그러나 행복도 잠시, 오랜 연인이자 음악적 파트너로서 함께 노래를 만들고 부르는 것이 좋았던 그레타와 달리 스타가 된 데이브의 마음은 어느새 변해버린다. 스타 음반프로듀서였지만 이제는 해고된 ‘댄’(마크 러팔로)은 미치기 일보직전 들른 뮤직바에서 그레타의 자작곡을 듣게 되고 아직 녹슬지 않은 촉을 살려 음반제작을 제안한다. 거리 밴드를 결성한 그들은 뉴욕의 거리를 스튜디오 삼아 진짜로 부르고 싶었던 노래를 만들어가는데…");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 2:
                            ivPoster.setImageResource(posterID[2]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("미드나잇인파리");
                                    dlg.setMessage("약혼자 '이네즈'(레이첼 맥아담스)를 두고 홀로 파리의 밤거리를 배회하던 '길'(오웬 윌슨)은 종소리와 함께 홀연히 나타난 차에 올라타게 되고 그곳에서 1920년대를 대표하는 예술가들과 조우하게 된다. 그 날 이후 매일 밤 1920년대로 떠난 '길'은 평소에 동경하던 예술가들과 친구가 되어 꿈 같은 시간을 보내게 되고 헤밍웨이와 피카소의 연인이자 뮤즈인 ‘애드리아나’(마리옹 꼬띠아르)를 만나게 된다. 시간이 지날수록 ‘길’은 예술과 낭만을 사랑하는 매혹적인 그녀에게 빠져들게 되는데… 세기를 초월한 사랑은 이뤄질 수 있을까?");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 3:
                            ivPoster.setImageResource(posterID[3]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("노팅힐");
                                    dlg.setMessage("세계적인 스타이자 지구상에서 가장 아름다운 여자 ‘애나 스콧’ 런던의 노팅 힐에서 여행 전문 서점을 운영하는 남자 ‘윌리엄 태커’ 아주 평범한 사랑을 기다리는 그녀와 너무 특별한 사랑이 두려운 그의 꿈 같은 로맨스가 다시, 시작된다! 여기 노팅 힐에서…");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 4:
                            ivPoster.setImageResource(posterID[4]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("타이타닉");
                                    dlg.setMessage("우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭(레오나르도 디카프리오)은 막강한 재력의 약혼자와 함께 1등실에 승선한 로즈(케이트 윈슬렛)에게 한 눈에 반한다. 진실한 사랑을 꿈꾸던 로즈 또한 생애 처음 황홀한 감정에 휩싸이고, 둘은 운명 같은 사랑에 빠지는데…");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 5:
                            ivPoster.setImageResource(posterID[5]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("라라랜드");
                                    dlg.setMessage("꿈을 꾸는 사람들을 위한 별들의 도시 ‘라라랜드’. 재즈 피아니스트 ‘세바스찬’(라이언 고슬링)과 배우 지망생 ‘미아’(엠마 스톤), 인생에서 가장 빛나는 순간 만난 두 사람은 미완성인 서로의 무대를 만들어가기 시작한다.");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 6:
                            ivPoster.setImageResource(posterID[6]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("해리포터와 마법사의 돌");
                                    dlg.setMessage("해리 포터(다니엘 래드클리프 분)는 위압적인 버논 숙부(리챠드 그리피스 분)와 냉담한 이모 페투니아 (피오나 쇼 분), 욕심 많고 버릇없는 사촌 더즐리(해리 멜링 분) 밑에서 갖은 구박을 견디며 계단 밑 벽장에서 생활한다. 이모네 식구들 역시 해리와의 동거가 불편하기는 마찬가지. 이모 페투니아에겐 해리가 이상한(?) 언니 부부에 관한 기억을 떠올리게 만드는 달갑지 않은 존재다. 11살 생일이 며칠 앞으로 다가왔지만 한번도 생일파티를 치르거나 제대로 된 생일선물을 받아 본 적이 없는 해리로서는 특별히 신날 것도 기대 할 것도 없다. 11살 생일을 며칠 앞둔 어느 날 해리에게 초록색 잉크로 쓰여진 한 통의 편지가 배달된다. 그 편지의 내용은 다름 아닌 해리의 11살 생일을 맞이하여 전설적인“호그와트 마법학교”에서 보낸 입학초대장이었다. 그리고 해리의 생일을 축하하러 온 거인 해그리드는 해리가 모르고 있었던 해리의 진정한 정체를 알려주는데. 그것은 바로 해리가 굉장한 능력을 지닌 마법사라는 것! 해리는 해그리드의 지시대로 자신을 구박하던 이모네 집을 주저없이 떠나 호그와트행을 택한다. 런던의 킹스크로스 역에 있는 비밀의 9와 3/4 승장장에서 호그와트 특급열차를 탄 해리는 열차 안에서 같은 호그와트 마법학교 입학생인 헤르미온느 그레인저(엠마 왓슨 분)와 론 위즐리 (루퍼트 그린트 분)를 만나 친구가 된다. 이들과 함께 호그와트에 입학한 해리는, 놀라운 모험의 세계를 경험하며 갖가지 신기한 마법들을 배워 나간다. 또한 빗자루를 타고 공중을 날아다니며 경기하는 스릴 만점의 퀴디치 게임에서 스타로 탄생하게 되며, 용, 머리가 셋 달린 개, 유니콘, 켄타우루스, 히포그리프(말 몸에 독수리 머리와 날개를 가진 괴물)등 신비한 동물들과 마주치며 모험을 즐긴다. 그러던 어느 날 해리는 호그와트 지하실에 `영원한 생을 가져다주는 마법사의 돌'이 비밀리에 보관되어 있다는 것을 알게되고, 해리의 부모님을 죽인 볼드모트가 그 돌을 노린다는 사실도 알게 된다. 볼드모트는 바로 해리를 죽이려다 실패하고 이마에 번개모양의 흉터를 남긴 장본인이다. 해리는 볼드모트로부터 마법의 돌과 호그와트 마법학교를 지키기 위해 필사의 노력을 하는데...");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 7:
                            ivPoster.setImageResource(posterID[7]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("나홀로집에");
                                    dlg.setMessage("크리스마스 시즌의 시카고. 말썽꾸러기라 집안 가족들로부터 욕을 듣고 따돌림 당하는 케빈은 늘 자신은 혼자 살거라면서 가족들이 모두 없어졌으면 좋겠다고 생각한다. 자기의 치즈 피자를 먹은 형과 싸워 소동을 일으키자 엄마는 케빈을 3층 다락방으로 올려보낸다. 케빈의 가족들과 케빈의 집에 온 손님들은 다음 날에 크리스마스 연휴를 이용해 프랑스의 친척 집으로 떠날 계획이었다. 그날 밤, 바람이 세차게 불어 전화선과 전기선이 끊긴다. 케빈의 가족들은 늦잠을 자게 되어 비행기 시간을 맞추기 위해 허둥대다가 그만 3층 다락방에서 잠이 든 케빈을 두고 떠난다. 잠에서 깬 케빈은 혼자 남은 것을 알고 하느님이 자신의 소원을 들어주었다고 기뻐한다. 비행기를 타고 가던 케빈의 어머니는 무엇인가 빠뜨린 기분에 고민하다가 케빈을 두고 왔음에 놀란다. 하지만 전화선이 불통이라, 어쩔 수 없다가 프랑스에 도착한 식구들은 목적지로 가고 엄마는 케빈이 걱정이 되어 집으로 돌아갈 비행기표를 사기 위해 안간힘을 쓰지만 연말연휴라 좌석이 없었다. 혼자 집에 남은 케빈은 형과 누나 방을 구경하면서 즐거워한다. 그리고 노래를 부르고 트리도 만들면서 자축한다. 그런데 빈집털이 2인조 도둑이 케빈의 집을 호시탐탐 노리고 있다는 것을 알게 되는데...");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 8:
                            ivPoster.setImageResource(posterID[8]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("트와일라잇");
                                    dlg.setMessage("17세의 평범한 고등학생 소녀 ‘벨라’는 집안 사정으로 워싱턴 주 포크스에 있는 아빠의 집으로 이사를 온다. 전학 첫날, ‘벨라’는 냉담하지만 자신을 무장 해제시킬 정도로 잘생긴 ‘에드워드’와 마주치고, 전율과 두려움 넘치는 인생의 전환을 맞이한다. ‘에드워드’와 돌이킬 수 없는 사랑에 빠져든 ‘벨라’. 하지만 ‘에드워드’와 그의 가족이 뱀파이어 일족이라는 사실을 알게 되고, 예기치 못한 운명에 빠져든다.");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                        case 9:ivPoster.setImageResource(posterID[9]);
                            btnTxt.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(FourthActivity.this);
                                    dlg.setTitle("토이스토리4");
                                    dlg.setMessage("장난감의 운명을 거부하고 떠난 새 친구 ‘포키’를 찾기 위해 길 위에 나선 ‘우디’는 우연히 오랜 친구 ‘보핍’을 만나고 그녀를 통해 새로운 세상에 눈을 뜨게 된다. 한편, ‘버즈’와 친구들은 사라진 ‘우디’와 ‘포키’를 찾아 세상 밖 위험천만한 모험을 떠나게 되는데…");
                                    dlg.setPositiveButton("확인", null);
                                    dlg.show();
                                }
                            });
                            break;
                    }
                    return false;
                }
            });
            return imageView;
        }
    }
}

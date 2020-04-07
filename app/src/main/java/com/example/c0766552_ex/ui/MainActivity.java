package com.example.c0766552_ex.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.c0766552_ex.R;
import com.example.c0766552_ex.adapters.AttractionListActivity;
import com.example.c0766552_ex.model.CanadaAttraction;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPlacesList;
    private ArrayList<CanadaAttraction> places;
    private AttractionListActivity placesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Attraction List");

        rvPlacesList = findViewById(R.id.rvPlacesList);

        placesinfo();

        placesAdapter = new AttractionListActivity(places);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        rvPlacesList.setLayoutManager(mLayoutManager);

        rvPlacesList.setAdapter(placesAdapter);
    }

    private void placesinfo(){
        places = new ArrayList<>();
        places.add(new CanadaAttraction(1,"Niagra Falls", "332 Prospect St, Niagara Falls, NY 14303", "New York", "Ontario", "Niagara Falls is Canada's most famous natural attraction, bringing in millions of visitors each year. Located just over an hour's drive from Toronto, along the American border, these massive falls drop approximately 57 meters.", R.drawable.niagarafalls));
        places.add(new CanadaAttraction(2,"Banff National Park & the Rocky Mountains", "1029 Banff Ave, Banff, AB T1L 1H8", "Banff", "Alberta", "Banff National Park lies in the heart of the majestic Rocky Mountains in the province of Alberta. Banff is also a major winter sports area and home to Lake Louise Ski Resort and Sunshine Village, two of Canada's most prominent ski destinations.", R.drawable.banff));
        places.add(new CanadaAttraction(3,"Toronto's CN Tower", "290 Bremner Blvd, Toronto, ON M5V 3L9", "Toronto", "Ontario", "The tower stands an impressive 553 meters high and dominates the skyline. At the top, you can find fine dining in the revolving 360 restaurant, and enjoy a meal while looking out over the city and lake. The LookOut and the Glass Floor offer beautiful views out over the entire area.", R.drawable.cn));
        places.add(new CanadaAttraction(4,"Ottawa's Parliament Hill", "Wellington St, Ottawa, ON K1A 0A9", "Ottawa", "Ontario", "Ottawa's Parliament Hill stands high above the Ottawa River and is graced by the Neo-Gothic-style Parliament buildings built in the last half of the 19th century. The most prominent feature is the Peace Tower, which divides the House of Commons and the Senate on either side.", R.drawable.ottawaparliamenthill));
        places.add(new CanadaAttraction(5,"St. John's Signal Hill National Historic Site", "230 Signal Hill Rd, St. John's, NL A1A 1B3", "St. John's", "Newfoundland and Labrador", "At the entrance to St. John's harbor, overlooking the city and sea, is Signal Hill National Historic Site. It also played a strategic role in the Seven Years war with France, although the current fortifications were built during the hostilities of 1812.", R.drawable.signalhill));
        places.add(new CanadaAttraction(6,"Vancouver's Stanley Park", "Vancouver, BC V6G 1Z4", "Vancouver", "British Columbia", "One of Vancouver's greatest treasures is the 405-hectare Stanley Park, conveniently located on the west side of the downtown area. Situated on a peninsula, the park is surrounded by the ocean and home to huge red cedar and Douglas fir trees.", R.drawable.vancouverstanleypark));
        places.add(new CanadaAttraction(7,"Calgary Stampede", "1410 Olympic Way SE, Calgary, AB T2G 2W1", "Calgary", "Alberta", "This 10-day affair is one of the most widely anticipated events in Western Canada. At the Stampede Grounds are daily rodeo events drawing participants from across North America, rides, food, and the nightly Grandstand Show.", R.drawable.calgarystampede));
        places.add(new CanadaAttraction(8,"Canadian Museum for Human Rights", "85 Israel Asper Way, Winnipeg, MB R3C 0L5", "Winnipeg", "Manitoba", "Winnipeg's newest major attraction, which has drawn both national and international attention, is the Canadian Museum for Human Rights. Opening in 2014, the building displays a unique design that is eye-catching, with geometry and colors based on images of the Canadian landscape.", R.drawable.winnipeghumanrights));
        places.add(new CanadaAttraction(9,"Butchart Gardens", "800 Benvenuto Ave, Brentwood Bay, BC V8M 1J8", "Victoria", "British Columbia", "Of all the top tourist attractions in Canada, Butchart Gardens is the best place to explore with a camera in hand. With an enchanting display of flowers around, fun boat tours, night illuminations & more, there’s a lot to see and do here that will make your holiday vibrant!", R.drawable.butchartgardens));
        places.add(new CanadaAttraction(10,"Algonquin Provincial Park", "Ontario 60, Ontario K0J 2M0", "Whitney", "Ontario", "With lush green forests, enchanting rivers & lakes, this place makes for the best tourist places in Canada for anyone who loves nature. You can indulge in wildlife spotting, camping, canoeing, and more activities.", R.drawable.algonquinpark));
        places.add(new CanadaAttraction(11,"Yoho National Park", "Field, BC V0A 1G0", "Golden", "British Columbia", "Of all the Canada tourist places, Yoho National Park located in the heart of the Canadian Rocky Mountains falls under nature lovers must visit places in Canada. Its gorgeously massive Wapta and Takakkaw Falls make it ideal for your Canada holiday pictures.", R.drawable.yohonationalpark));
        places.add(new CanadaAttraction(12,"Forillon National Park", "1238 Boul de Forillon, Gaspé, QC G4X 6T9", "Gaspé", "Quebec", "One of the best places to see in Canada, is it tucked between the Gulf of St. Lawrence in Quebec and the Bay of Gaspe, Forillon National Park is home to several untamed hiking trails which has attracted several trekkers from not only Canada but from all around.", R.drawable.forillonnationalpark));
        places.add(new CanadaAttraction(13,"Columbia Icefield Skywalk", "Icefields Pkwy, Jasper, AB T0E 1E0", "Jasper", "Alberta", "This one-kilometer walkway is stretched 35 meters ahead to give an amazing view of nature. This glass floor is almost as high as the CN Tower so, get ready to get this experience. This is one of the top places to see in Canada for all adventure junkies!", R.drawable.skywalk));
        places.add(new CanadaAttraction(14,"Montmorency Falls", "5300 Boulevard Sainte-Anne, Québec, QC G1C 1S1", "Quebec City", "Quebec", "Montmorency Falls is located just 12 kilometers away from the heart of Quebec city. They are the highest falls in the country being 100 feet higher than the famous Niagara Falls. The best part is that you can take a good look at these falls by going for a walk over the suspension bridge.", R.drawable.montmorencyfalls));
        places.add(new CanadaAttraction(15,"Capilano Suspension Bridge", "3735 Capilano Rd, North Vancouver, BC V7R 4J1", "North Vancouver", "British Columbia", "It is 140 meters long and 70 meters high above the river and taking a stroll through the thick green forest will make you fall in love with this place. If you have a fear of heights then you might want to skip this place.", R.drawable.suspensionbridge));
    }
}


package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Bars4: ImageVector
    get() {
        if (_Bars4 != null) {
            return _Bars4!!
        }
        _Bars4 = ImageVector.Builder(
            name = "Outlined.Bars4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.75f, 5.25f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 4.5f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 4.5f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 4.5f)
                horizontalLineToRelative(16.5f)
            }
        }.build()

        return _Bars4!!
    }

@Suppress("ObjectPropertyName")
private var _Bars4: ImageVector? = null

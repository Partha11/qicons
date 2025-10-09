package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.PaperAirplane: ImageVector
    get() {
        if (_PaperAirplane != null) {
            return _PaperAirplane!!
        }
        _PaperAirplane = ImageVector.Builder(
            name = "Outlined.PaperAirplane",
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
                moveTo(6f, 12f)
                lineTo(3.269f, 3.125f)
                arcTo(59.769f, 59.769f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.485f, 12f)
                arcTo(59.768f, 59.768f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.27f, 20.875f)
                lineTo(5.999f, 12f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(7.5f)
            }
        }.build()

        return _PaperAirplane!!
    }

@Suppress("ObjectPropertyName")
private var _PaperAirplane: ImageVector? = null

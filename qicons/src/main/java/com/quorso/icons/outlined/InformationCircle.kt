package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.InformationCircle: ImageVector
    get() {
        if (_InformationCircle != null) {
            return _InformationCircle!!
        }
        _InformationCircle = ImageVector.Builder(
            name = "Outlined.InformationCircle",
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
                moveToRelative(11.25f, 11.25f)
                lineToRelative(0.041f, -0.02f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.063f, 0.852f)
                lineToRelative(-0.708f, 2.836f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.063f, 0.853f)
                lineToRelative(0.041f, -0.021f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
                moveTo(12f, 8.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(12f, 8.258f)
                lineTo(12f, 8.25f)
                close()
            }
        }.build()

        return _InformationCircle!!
    }

@Suppress("ObjectPropertyName")
private var _InformationCircle: ImageVector? = null

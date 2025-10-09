package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Banknotes: ImageVector
    get() {
        if (_Banknotes != null) {
            return _Banknotes!!
        }
        _Banknotes = ImageVector.Builder(
            name = "Outlined.Banknotes",
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
                moveTo(2.25f, 18.75f)
                arcToRelative(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.797f, 2.101f)
                curveToRelative(0.727f, 0.198f, 1.453f, -0.342f, 1.453f, -1.096f)
                lineTo(19.5f, 18.75f)
                moveTo(3.75f, 4.5f)
                verticalLineToRelative(0.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 6f)
                horizontalLineToRelative(-0.75f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-0.375f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                lineTo(20.25f, 4.5f)
                moveTo(2.25f, 6f)
                verticalLineToRelative(9f)
                moveToRelative(18f, -10.5f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.75f)
                moveToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(0.375f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(9.75f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-0.375f)
                moveToRelative(1.5f, -1.5f)
                lineTo(21f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                moveToRelative(0f, 0f)
                lineTo(3.75f, 16.5f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-0.375f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.125f, -1.125f)
                lineTo(2.25f, 15f)
                moveToRelative(1.5f, 1.5f)
                verticalLineToRelative(-0.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 15f)
                horizontalLineToRelative(-0.75f)
                moveTo(15f, 10.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
                moveTo(18f, 10.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(18f, 10.508f)
                lineTo(18f, 10.5f)
                close()
                moveTo(6f, 10.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(6f, 10.508f)
                lineTo(6f, 10.5f)
                close()
            }
        }.build()

        return _Banknotes!!
    }

@Suppress("ObjectPropertyName")
private var _Banknotes: ImageVector? = null
